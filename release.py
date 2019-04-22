"""Used to release via TravisCI"""

import argparse
import gitapi

class Release:
    """Class for Release methods"""
    def __init__(self, args):
        """DOCCCS"""

        self.version = args.version

        repo = gitapi.Repo('/Users/andy/leetcode')

        status = repo.gitstatus()



    def bump_travis(self):
        """Method that bumps version on .travis.yml"""
        travis = open(".travis.yml").readlines()

        print(travis)
        new_travis = []

        for line in travis:
            if line.startswith("  file: 'target/leetcode"):
                line = line.replace(line[24 : (len(line) - 6)], str(self.version))
            new_travis += line

        new_travis = "".join(new_travis)
        overwrite_travis = open(".travis.yml", "w")
        overwrite_travis.write(new_travis)

    def bump_pom(self):
        """Method that bumps version on pom.xml"""


def main():
    """Where the magic happens"""
    parser = argparse.ArgumentParser()
    parser.add_argument("version", type=float)
    args = parser.parse_args()

    releaser = Release(args)

    releaser.bump_travis()

    releaser.bump_pom()


if __name__== "__main__":
    main()
