# AuthenticationService
## How to contribute
NB: 
- `upstream` represents [LagosJUG remote repository](https://github.com/LagosJavaUserGroup/AuthenticationService) on github
- `origin` represents your remote repository on github

---
### First time Contribution

1. Fork the repo to your github profile

2. Clone the repo from your github profile to your local workspace
        
        git clone git@github.com:<your_repo>/AuthenticationService.git

3. cd into the authentication folder

        cd AuthenticationService

4. checkout the dev branch

        git checkout develop

5. create a feature branch off the dev branch to make your changes

        git checkout -b feature1

6. make your changes and commit

        git commit -am "<commit message>"

7. push the changes to your remote repository

        git push --set-upstream origin feature1

8. create a pull request from the branch on your remote repository to the upstream repository


---
### For continuous contribution

1. Set your upstream repo

        git remote add upstream "git@github.com:LagosJavaUserGroup/AuthenticationService.git"

2. Fetch from upstream

        git fetch upstream

3. Create a new branch from develop branch on upstream

        git checkout -b feature upstream/develop
4. make your changes and commit

        git commit -am "<commit message>"

5. push the changes to your remote repository

    `set default remote repo/branch`

        git push --set-upstream origin feature2

    `for any further push to the same repo/branch:` 
        
        git push

6. create a pull request from the branch on your remote repository to the upstream repository

---
### For continuous contribution when you experience merge conflict when creating a pull request

1. Fetch from the upstream repository

        git fetch upstream

2. rebase your working branch on upstream/develop

        git rebase feature2 upstream/develop

3. force push to your remote

        git push --force

4. create a pull request from the branch on your remote repository to the upstream repository

