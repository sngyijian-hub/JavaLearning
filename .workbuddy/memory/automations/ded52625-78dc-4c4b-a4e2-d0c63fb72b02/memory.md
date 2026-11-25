# 每日学习卡自动化 · 执行记录

## 2026-11-19（首次，准备期）
- 状态：日期早于 W1(11-23)，输出准备期卡片；用户已提前动手 W1，故卡片聚焦 W1 欠账（HTTP 6 接口、Maven jar、Git push/commit 数、WSL2 选做）+ LeetCode 2 题。
- 记忆：docx v1 与 HTML v2 均设为长期记忆；确认 v2 为权威，修正 M2 归属 W17、W18 改为 Python/FastAPI。
- 未改动日期锚点与里程碑。等待用户回复进度后进入反馈评估流程。

## 2026-11-24（W1 D2，周二）
- 现场核查：docs/api-design.md 仍为 M（未提交）；commit 已≥10；Maven 打包仍未开始。
- 卡片主线：补回第 5、6 条 JSON 样例并 commit → 手打 pom.xml + mvn package + java -jar → WSL2 仅 wsl --status 检查（选做）。
- 并行轨：LC 27 移除元素 + LC 26 删除有序重复项（若昨日 283/1 未做则先补）。
- 提醒聚焦「改一半不收尾」失分模式：每完成一项立刻 commit。
- 等待用户进度反馈后走评估流程。

## 2026-11-25（W1 D3，周三）
- 现场核查：commit=10 ✅ 但 `docs/api-design.md` 仍为 M（已第 3 天未提交）；第 5、6 条 JSON 样例已补回 ✅；仍无 pom.xml / src / target（Maven 完全未开始）；mvn 3.9.9 与 JDK17 命令均正常。
- 卡片主线：①先 commit+push 接口文档收尾（15min）②Maven 三步：手写 pom → 建 src/main/java 并给类加 package → mvn clean package + java -jar（105min）③WSL2 仅状态检查（选做）。
- 并行轨：LC 121 + LC 88（数组双指针），27/26 若未做先补。
- 风险：W1 验收 11-29 仅剩 Maven 一项未过，若 11-26 仍未跑通则 11-27 起砍掉全部 ★3 与 WSL2。
- 等待用户进度反馈后走评估流程。

## 2026-11-23（W1 D1，正式开营日）
- 现场核查：git commit=8（W1 需≥10）；`docs/api-design.md` 6 条已填但存 3 处硬错（第3条 JSON 缺引号/拼写 succcess；第5条失败码写 200 应 404，且 204 带了 body；第6条登录路径误用 `/api/users/{id}`、入参误用 id）；无 pom.xml、无 target（Maven 打包未做）。
- 卡片主线：修接口文档 3 错 + 口述 201/204/400/401 → commit 补到 ≥10 → Maven 打包可执行 jar 跑通；WSL2 仍为 ★3 选做。
- 并行轨启动：LC 1 两数之和（哈希）+ LC 283 移动零（双指针）。
- W1 验收日 = 2026-11-29（周日），三项：≥10 commit / java -jar 跑通 / 6 接口设计。未触发止损。
- 同日 13:44 重复触发一次，卡片内容不变，未重复追加台账。

## 2026-11-20（D-3，准备期）
- 现场核查：Git 仓库 sngyijian-hub/JavaLearning 已有 7 次 commit（W1 需 ≥10）；docs/api-design.md 仅第 1、2 条完成，3–6 条仍为空模板；无 pom.xml（Maven 已装 C:\dev\maven\bin，jar 打包未做）。
- 卡片主线：接口 3–6 落盘（抄→注→遮写）→ commit 补到 ≥10 → 手打可执行 jar；WSL2 继续砍（★★★选做）；并行轨 W2 才启动，今天只给 2 题热身（LC 1 / 283）。
- 未触发止损（连续 2 周才算）。日期锚点未改：W1 仍 11-23 起，验收仍 11-22/11-23 前的三项。
- 用户偏好已二次确认并写入 user MEMORY.md（学习资源必须给具体 URL / B站关键词）。

