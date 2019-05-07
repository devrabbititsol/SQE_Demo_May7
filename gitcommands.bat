source ~/.bash_profile
cd /Users/devrabbit/Desktop/18-06-FrameworkGit/SmartQE
cd /Users/devrabbit/Desktop/18-06-FrameworkGit/SmartQE
git init
 git add .
git rm -r --cached target
git rm -r --cached test-output
git rm -r --cached gitcommands.bat
git rm -r --cached gitcommands.sh
git rm -r --cached APIReports
git rm -r --cached MobileReports
git rm -r --cached WebReports
git rm -r --cached jenkins*
git rm -r --cached config*
git commit -m "first commit"
git remote add origin https://Rajsekhar355:MohanReddy355@github.com/devrabbititsol/TestProject.git
git push -u origin master

