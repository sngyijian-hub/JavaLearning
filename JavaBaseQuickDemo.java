public class JavaBaseQuickDemo {
    // 主入口
    public static void main(String[] args) {
        // 1. 变量演示（HTTP常用类型）
        int code = 200;
        String url = "https://api.test.com";
        boolean ok = true;
        double timeCost = 12.5;
        System.out.println("请求地址：" + url);

        // 2. if 判断 HTTP状态码
        if (code == 200) {
            System.out.println("✅ 请求成功");
        } else if (code == 404) {
            System.out.println("❌ 接口不存在 404");
        } else {
            System.out.println("⚠️ 请求异常");
        }

        // 3. 调用static方法
        printMsg("本次请求耗时：" + timeCost + "ms");
        int sum = add(10, 20);
        System.out.println("计算结果：" + sum);

        // 4. for循环，模拟遍历接口返回日志
        System.out.println("\n=== 接口日志列表 ===");
        for (int i = 0; i < 3; i++) {
            System.out.println("日志条目 " + i);
        }

        // 5. 实体类：Response（对应HTTP返回JSON）
        Response resp = new Response();
        resp.code = 200;
        resp.msg = "操作成功";
        System.out.println("\n接口返回：code=" + resp.code + " , msg=" + resp.msg);

        // 6. 数组演示（main方法args就是这种格式）
        String[] dataList = {"data1","data2","data3"};
        System.out.println("数组第一条数据：" + dataList[0]);
    
    }// <-main


    // 静态方法：无返回，打印信息
    public static void printMsg(String msg) {
        System.out.println(msg);
    }

    // 静态方法：有返回值，求和
    public static int add(int x, int y) {
        return x + y;
    }

}// <-class



//在class外定义的类，默认是包内可见的，不能加public

// 实体类，和HTTP返回报文对应，不加public，放同文件
class Response {
    int code;
    String msg;
}


// 备用实体类（可选）
class User {
    String name;
    int age;
}
