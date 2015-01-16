# Guild-Wars-2-App
An application to aid the playing of Guild Wars 2
This application is planned to act as an wiki, and have timers for upcoming bosses.
Current work is on Android development.

# Collaboration
This project is currently closed for collaboration except to accepted collaborators.

## Development guidelines
Development is expected to be completed with eclipse, android development kit.
### Coding style
Look for the Code Style and Compiler Eclipse settings file in the repository (by going to File -> Import...).
It should be named java-code_syle-compiler-prefs.epf
Don't forget to apply the new style after you import it.

Set save actions by going to Eclipse's preferences/options, and under Java Editor and Save Actions check "Perform the selection actions on save", "Format source code" and "Format all lines", and "Organize imports".
Use the Unix text file line delimiter (especially important if you are using Windows) by going to Eclipse's preferences/options, and under General and Workspace set "New text file line delimiter" to be "Unix".

When commiting code, please review to make sure your format is correct.
Do not commit a series of whitespace changes, unless you specify the commit is reformatting.
You can check the changes you have made with the command `git diff` to ensure you are not commiting an entire file of whitespace changes.

### Developer practices
We will use issue git issue tracking to keep track of tasks and progress.
For every task, create a new issue page decribing the tasks you are completing and mark it as in progress.
Please work on your own branch, named corresponding to the issue (ie. Issue1),
then request code review before merging code to master branch.
You may create a new branch by using `git checkout -b <branch-name>`
Periodically merge your branch with the master copy to make final merging smoother with the command `git merge master`
