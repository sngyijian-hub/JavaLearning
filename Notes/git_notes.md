\## 一、环境初始化（整台电脑只需要执行一次）



```

\# 设置用户名（和GitHub用户名一致）

git config --global user.name "你的GitHub用户名"

\# 设置邮箱（GitHub绑定的邮箱）

git config --global user.email "你的GitHub邮箱"

\# 查看配置是否生效

git config --list

```



\## 二、核心命令表



表格



| 命令 | 作用说明 |

| --- | --- |

| `git init` | 在当前文件夹初始化 Git 本地仓库，生成隐藏 `.git` 文件夹 |

| `git clone 远程仓库地址` | 把 GitHub 上的远程仓库下载到本地 |

| `git status` | 查看仓库当前状态：哪些文件被修改、是否加入暂存区 |

| `git add 文件名` | 将指定文件加入暂存区；`git add .` 把当前目录全部文件加入暂存 |

| `git commit -m "提交备注"` | 将暂存区内容提交到本地仓库，`-m` 后面写清楚本次改动 |

| `git log` | 查看所有提交历史，获取 commit-id（回滚版本要用） |

| `git branch` | 分支管理：无参数 = 列出本地分支；`git branch 分支名`= 新建分支 |

| `git switch 分支名` | 切换到指定分支（新版推荐，替代老的 checkout） |

| `git remote add origin 远程地址` | 本地仓库绑定远程 GitHub 仓库，origin 是远程仓库默认别名 |

| `git push origin 分支名` | 把本地分支的提交推送到远程仓库 |

| `git pull origin 分支名` | 拉取远程仓库最新代码并合并到本地 |

| `git merge 分支名` | 把目标分支的代码合并进当前所在分支 |

| `git reset --hard commit-id` | 版本回滚，强制回到指定提交版本；⚠️ 未提交修改会丢失，谨慎使用 |

| `git stash` | 临时储藏写了一半、不想提交的代码，切分支干活后再恢复 |



\## 三、标准实操流程（新建仓库完整链路）



```

\# 1. 创建本地文件夹并进入

mkdir git-demo

cd git-demo



\# 2. 初始化本地git仓库

git init



\# 3. 绑定远程仓库（替换成你自己GitHub仓库地址）

git remote add origin https://github.com/xxx/git-demo.git



\# 4. 创建/修改文件

echo "第一次测试git" > test.txt



\# 5. 查看状态

git status



\# 6. 添加到暂存区

git add .



\# 7. 提交到本地仓库

git commit -m "第一次提交：新增test.txt"



\# 8. 推送到远程main分支

git push origin main

```



\## 四、分支练习流程



```

\# 新建dev分支

git branch dev

\# 切换到dev分支

git switch dev



\# 在dev分支修改文件

echo "dev分支改动" >> test.txt

git add .

git commit -m "dev分支修改文件"

\# 推送dev分支到远程

git push origin dev



\# 切回主分支

git switch main

\# 将dev分支合并到main

git merge dev

```



\## 五、版本回滚练习（验收重点）



```

\# 查看提交记录，复制想要回退版本的commit-id

git log



\# 回滚到指定版本

git reset --hard 粘贴复制的commit-id



\# 推送到远程（仅练习仓库使用！正式项目禁止随便 --force）

git push origin main --force

```



\## 六、高频踩坑记录



1\. `fatal: not a git repository`：当前目录没有.git 仓库，需要执行 `git init` 或者进入正确仓库目录

2\. HTTPS 推送要求输入密码：GitHub 不再支持账号密码，使用个人访问令牌 PAT，或者配置 SSH 密钥

3\. 代码冲突：`<<<<<<< HEAD` 标记就是冲突位置，手动修改文件后，再执行 add、commit

4\. `git reset --hard` 风险：会丢掉所有未提交的修改，\*\*只在自己练习仓库使用\*\*



\## 七、本次验收清单



\- 配置 git 用户名邮箱

\- GitHub 新建仓库

\- 本地完成 init → add → commit → push

\- 新建分支、切换分支、分支推送、合并分支

\- git log 查看记录，执行一次版本回滚

