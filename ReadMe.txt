Git is a distributed version control system.
Git is a free software distributed under the GPL.
Git performs very well.
Git has a mutable index called stage.
cool~
Git tracks changes of files.
===================Git Command==============================
git init
git add file.txt
git commit -m "information for changes"
git diff
git status
git log 
git log --pretty=oneline
git reset --hard 版本号
git reflog
git checkout -- file.txt  丢掉工作区的修改
git rm file.txt -----> git commit
git push origin master 推送到远程库
-------------分支--------------------------------------------
git branch 查看分支
git branch <name> 创建分支
git checkout <name> 切换分支
git checkout -b <name> 创建切换分支
git merge <name> 合并某分支到当前分支
git merge --no-ff -m "information" <name>
git branch -d <name> 删除分支
--------------------------------------------------------------

Creating a new branch is  quick and simple.
--------------------------------------------------------------
git stash 保留工作现场---保留
git stash list
git stash pop 恢复并且删除stash == git stash apply stash@[0](选择要恢复stash) + git stash drop
git branch -a 可以查看到远程分支
git push origin --delete <branchName>  or  git push origin :<branchName>  删除远程分支
