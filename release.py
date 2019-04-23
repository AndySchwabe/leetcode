"""Used to release via TravisCI"""

import argparse
import sys
import gitapi


class Release:
    """Class for Release methods"""

    def __init__(self, args):
        """Constructor"""

        self.version = args.version

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
                        "Your travis version number is higher than the desired version number. Exiting..."
                    )
                else:
                    line = line.replace(line[25 : (len(line) - 6)], str(self.version))
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
                        "Your pom version number is higher than the desired version number. Exiting..."
                    )
                else:
                    line = line.replace(line[10 : (len(line) - 11)], str(self.version))
            new_pom += line

        new_pom = "".join(new_pom)
        overwrite_pom = open("pom.xml", "w")
        overwrite_pom.write(new_pom)
        overwrite_pom.close()

    def commit_and_tag(self):
        """Method to stage changes, commit changes, tag commit, and push to origin"""



def main():
    """Where the magic happens"""
    parser = argparse.ArgumentParser()
    parser.add_argument("version", type=float)
    args = parser.parse_args()

    releaser = Release(args)

    releaser.bump_travis()

    releaser.bump_pom()

    releaser.commit_and_tag()

if __name__ == "__main__":
    main()
