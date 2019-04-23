"""Used to release via TravisCI"""

import argparse
import sys
import gitapi


class Release:
    """Class for Release methods"""

    def __init__(self, args):
        """Constructor"""

        self.version = args.version

        if self.version.startswith('v'):
            pass
        else:
            self.version = 'v' + self.version

        self.repo = gitapi.Repo("/Users/andy/leetcode")

        status = self.repo.git_status()

        #if status:
        #    sys.exit("Git Repo has uncommitted changes. Exiting...")

        tags = self.repo.git_tags()

        if tags[len(tags) - 1] > self.version:
            sys.exit("Specified lower git tag version than current version. Exiting...")
        elif self.version in tags:
            sys.exit("Specified current git tag version. Exiting...")

    def bump_travis(self):
        """Method that bumps version on .travis.yml"""

        travis = open(".travis.yml").readlines()

        new_travis = []

        for line in travis:
            if line.startswith("  file: 'target/leetcode"):
                if line[25 : (len(line) - 6)] > self.version:
                    sys.exit(
                        "Your current travis version number is higher than the desired version number. Exiting..."
                    )
                else:
                    line = line.replace(line[25 : (len(line) - 6)], self.version)
            new_travis += line

        new_travis = "".join(new_travis)
        overwrite_travis = open(".travis.yml", "w")
        overwrite_travis.write(new_travis)
        overwrite_travis.close()

    def bump_pom(self):
        """Method that bumps version on pom.xml"""

        pom = open("pom.xml").readlines()

        new_pom = []

        for line in pom:
            if line.startswith("\t<version>"):
                if line[10 : (len(line) - 11)] > self.version:
                    sys.exit(
                        "Your current pom version number is higher than the desired version number. Exiting..."
                    )
                else:
                    line = line.replace(line[10 : (len(line) - 11)], self.version)
            new_pom += line

        new_pom = "".join(new_pom)
        overwrite_pom = open("pom.xml", "w")
        overwrite_pom.write(new_pom)
        overwrite_pom.close()

    def commit_and_tag(self):
        """Method to stage changes, commit changes, tag commit, and push to origin"""
        self.repo.git_add("pom.xml")
        self.repo.git_add(".travis.yml")
        commit_message = "Updating version to: " + self.version
        self.repo.git_commit(commit_message, user="Andy Schwabe <andy.schwabe@infor.com>", ".")
        self.repo.git_tag(self.version)
        self.repo.git_push()


def main():
    """Where the magic happens"""
    parser = argparse.ArgumentParser()
    parser.add_argument("version", type=str)
    args = parser.parse_args()

    releaser = Release(args)

    releaser.bump_travis()

    releaser.bump_pom()

    releaser.commit_and_tag()

if __name__ == "__main__":
    main()
