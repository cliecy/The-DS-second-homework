import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        LinkList firstfloor = new LinkList();
        LinkList secondfloor = new LinkList();
        Scanner input = new Scanner(System.in);
        while (1 > 0) {
            System.out.println("根据操作说明输入操作1.插入 2.删除 3.查询");
            int b = input.nextInt();
            if (b == 4) {
                LinkList.hebing(firstfloor, secondfloor);
                continue;
            }
            System.out.println("请选择楼层，输入1或者2");
            int a = input.nextInt();

            System.out.println("你要操作该层第几个房间？");
            int c = input.nextInt();
            if (a == 1) {
                if (b == 1) {
                    System.out.println("依次输入房间号，房间的面积，床位数量，男女宿舍,卫浴");

                    Node one = new Node(0, 0, 0, 0, 0);
                    one.set("number", input.nextInt());
                    one.set("square", input.nextInt());
                    one.set("membersize", input.nextInt());
                    one.set("sex", input.nextInt());
                    one.set("whetherhavetoilet", input.nextInt());
                    firstfloor.insert(one, c);
                }
                if (b == 2) {
                    firstfloor.delete(c);
                }
                if (b == 3) {
                    if(c>firstfloor.length) {
                        System.out.println("输入错误，请不要查询不存在的房间");
                        continue;
                    }
                    Node tmp = firstfloor.getfirst();
                    for (int i = 0; i < c; i++) {
                        tmp = tmp.next;
                    }
                    System.out.println("房间号:" + tmp.get("number"));
                    System.out.println("面积:" + tmp.get("square"));
                    System.out.println("独立卫浴:" + tmp.get("whetherhavetoilet"));
                    System.out.println("床位:" + tmp.get("membersize"));
                    System.out.println("男女:" + tmp.get("sex"));
                }
            }
            if (a == 2) {
                if (b == 1) {
                    System.out.println("依次输入房间号，房间的面积，床位数量，男女宿舍,卫浴");

                    Node one = new Node(0, 0, 0, 0, 0);
                    one.set("number", input.nextInt());
                    one.set("square", input.nextInt());
                    one.set("membersize", input.nextInt());
                    one.set("sex", input.nextInt());
                    one.set("whetherhavetoilet", input.nextInt());
                    secondfloor.insert(one, c);
                }
                if (b == 2) {
                    secondfloor.delete(c);
                }
                if (b == 3) {
                    if(c>secondfloor.length) {
                        System.out.println("输入错误，请不要查询不存在的房间");
                        continue;
                    }

                    Node tmp = secondfloor.getfirst();
                    for (int i = 0; i < c; i++) {
                        tmp = tmp.next;
                    }

                    System.out.println("房间号:" + tmp.get("number"));
                    System.out.println("面积:" + tmp.get("square"));
                    System.out.println("独立卫浴:" + tmp.get("whetherhavetoilet"));
                    System.out.println("床位:" + tmp.get("membersize"));
                    System.out.println("男女:" + tmp.get("sex"));
                }
            }

        }

    }
}
