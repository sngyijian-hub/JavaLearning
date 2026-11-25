# 项目长期记忆 · Java 后端 + AI 应用 22 周路线

## 路线图来源与权威口径（2026-11-19 用户指定"设为记忆"）
- **权威版本 = v2**：`C:/Users/Songyj/Desktop/JavaLearing/java-ai-roadmap-v2.html`（修订版 v2，版本日期 2026-11-18）
- **v2 全文存档**：`.workbuddy/memory/reference/java-ai-roadmap-v2.md`（第 2 节表格含每周「验收标准（可自测）」，排期/验收一律以此为准）
- 历史 v1：`C:/Users/Songyj/Desktop/java-ai-roadmap-22w.docx`，存档 `.workbuddy/memory/reference/java-ai-roadmap-22w.md`。**与 v2 冲突时以 v2 为准**（v1 把 M2 放在 W18、W22 含 Agent/Spring AI；v2 已改为 M2 在 W17、Agent/Spring AI 移出主表降为 ★3 选学）。
- 进度台账：`C:/Users/Songyj/WorkBuddy/2026-11-18-21-54-27/study-progress.md`

## v2 相对 v1 的关键调整（已纳入记忆）
- 目标是**实习准备**不是就业；22 周交付物 = 项目A(公网前后端分离) + 项目B(RAG 含数字) + GitHub 记录 + Hot100 一刷 + 简历初稿。
- 前端压缩为 W17 一周（够用即止），W18 改为 Python+FastAPI；AI 扩为 W18–W22，**RAG 做深 > Agent 浅尝**。
- W17 完成 M2（前后端分离上线）；W18 是 Python/FastAPI 机动周，**不是** M2。

## 关键锚点（里程碑不可改）
- 22 周：W1=2026-11-23(周一) → W22=2027-04-19，2027-04-25 结束；每周一递增。
- 并行轨：LeetCode Hot100 每天 2 题（40–60 分钟，三刷法）；数据结构跟学校课；计网/OS 纯课上不计入并行线。
- 星级：★5 不可砍 / ★4 加分 / ★3 可延后。
- 机动周：W6(12-28)、W12(2027-02-08)、W18(2027-03-22) 任务量减 30%，只追赶欠账；月末 W4/W8/W12/W16/W20 加半日复盘。
- 里程碑：M1 公网地址(W16 2027-03-08)、M2 前后端分离上线(**W17 2027-03-15**)、M3 召回率@5/准确率数字(W21)、M4 项目B+简历+复盘(W22)。
- vibecoding：W1–W8 禁止写代码（0%，只允许 AI 解释报错/概念）；W9 起 30–50%；表设计/接口/核心业务/权限/缓存/RAG 检索链必须自己写。
- 止损：连续 2 周验收不过 → 先砍 W17 前端深度 → 项目A 范围 → 项目B 范围。保底：Git+HTTP+Linux、项目A 能跑、Hot100 一刷、能讲清的 RAG。
- 铁律：AI 生成的每行代码都要能讲清，讲不清就删掉重写。

## 各周验收标准（v2 速查，细节看全文存档）
W1 GitHub 仓库≥10 commit / jar 命令行 java -jar 跑通 / 6 个 RESTful 接口(方法+路径+入参+出参)｜W2 不看教程纯命令行建目录·搜内容·杀进程·改文件 + WSL2 下编译运行｜W3 每天150行全 push(周≥750) + 3 个控制台小程序｜W4 图书管理控制台(CRUD+继承+接口)｜W5 HashMap 词频统计 + 默写对比表 + 自定义异常｜W6 多线程交替打印 + 进程/线程/5状态/synchronized｜W7 Filter vs Interceptor 场景 + 3 个 JUnit 通过 + 分级日志｜W8 索引前后 EXPLAIN(type ALL→ref) + ACID/4 隔离级别｜W9 三层 CRUD + ≥3 处动态 SQL｜W10 手写极简 IOC + Bean 生命周期图 + AOP 用处｜W11 code/msg/data 统一返回 + @Valid + 全局异常｜W12 CRUD 全通 + Postman≥8 接口 + 分页 total｜W13 项目A 本地跑通 + README + ≥5 单测｜W14 3 角色权限验证 + JWT vs Session/token 泄露｜W15 热点接口缓存命中率 + 穿透雪崩击穿解法 + 更新顺序｜W16 M1 镜像+Nginx 反代+公网地址，项目A 加缓存限流｜W17 M2 前后端分离上线 + Vue 调接口 + CORS/代理｜W18 LLM 转发服务(流式) + 补欠账｜W19 裸问 vs 优化 Prompt 对比 + chunk/余弦/rerank + 向量库≥100 条｜W20 RAG 流程图 + 全链路跑通 + 故障现象｜W21 M3 ≥20 条测试问答 + chunk/rerank 对比表 + 召回率@5/准确率｜W22 M4 项目B 3 技术点 + 简历初稿 + 1 篇复盘 + ★5 清零。

## 刷题专题与周次的对应（2026-11-23 定；不改里程碑与 Hot100 一刷目标，只定专题顺序）
- 现在–W2：**数组 + 双指针**，只用 for/if 能写出来的题：283 移动零 / 27 移除元素 / 26 删除有序数组重复项 / 121 买卖股票 / 88 合并两个有序数组 / 136 只出现一次的数字。
- W3（学完 Java 集合后）：哈希类 → 1 两数之和 / 49 字母异位词分组 / 128 最长连续序列。
- W5（学完链表）：链表专题。
- W7 之后：栈与队列、二叉树（等学校数据结构课讲到树）。
- W10 之后：回溯、动态规划。
- 用户 2026-11-23 明确表示这些算法「都没学过」→ 刷题即学套路，不是复习；每个专题先看 20 分钟套路讲解再做 3–5 题。方法细节见用户级 MEMORY.md「刷算法题的方法」。

## 用户约定的文件存放规则（2026-11-19）
- 我整理的知识点/笔记/总结/模板，凡 `.md`/`.doc`/`.docx`/`.pdf` 等文档格式，默认写到 `C:/Users/Songyj/Desktop/JavaLearing/Notes/`，不写工作区根目录或 `docs/`（用户明确指定时除外）。
- 例外：路线图存档与记忆文件放 `.workbuddy/memory/reference/`；进度台账放 `C:/Users/Songyj/WorkBuddy/2026-11-18-21-54-27/study-progress.md`。
- 历史遗留：W1 接口设计模板最初写在 `docs/api-design.md`，后续同类文档一律直接进 `Notes/`。

## 当前状态（更新至 2026-11-23 晚）
- 已具备：JDK17(Temurin 17.0.21)、Maven 3.9.9(C:\dev\maven, 阿里云镜像)、IDEA Community 2025.3、Git 笔记与仓库 README 已写、Java 语法基础 demo 已跑通（变量/if/for/数组/实体类/静态方法）。
- W1 进展：Git commit 已达 10 次✅；6 条 RESTful 接口设计已完成✅（`docs/api-design.md`，Rookie 引号/username·password 已修正）。
- 欠账：Maven 打包 + `java -jar` 未验证❌；WSL2 未确认⚠️；接口文档第 5、6 条 JSON 样例曾被误删，需确认已补回。
- 环境类卡点已解除，后续不再重复排查。

## 定时任务
- 每日学习卡自动化 id：`ded52625-78dc-4c4b-a4e2-d0c63fb72b02`，历史记录在同目录 `automations/<id>/memory.md`。
- 卡片固定格式：标题(第Wn周·周X·阶段名) → 任务按★5→★4→★3 标注【必做】/【选做】+时长(工作日≤210min/周末≤360min)+可自测标准 → 并行轨 2 题 → 一句踩坑/止损提醒 → 结尾问进度。
- 收到进度反馈：逐项判 ✅/⚠️/❌ → 归类薄弱点(概念没懂/环境卡住/时间不够/代码调不通) → ≤3 条下一步动作 → 调次日计划 → 追加台账到 study-progress.md → 输出明日卡精简版。
