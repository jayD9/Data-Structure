package LeetCodePractice;

public class InsertionSortList42 {
    public static void main(String arg[]){
        ListNode four = new ListNode(3);
        ListNode three = new ListNode(1,four);
        ListNode two = new ListNode(2,three);
        ListNode root = new ListNode(4,two);

        ListNode temp = root;

        while(temp != null){
            System.out.println(temp.val);
            temp = temp.next;
        }
        System.out.println("-----");

        ListNode result = new ListNode(root.val);
        root = root.next;
        while(root != null){
            ListNode x = result;
            if(x.val > root.val){
                System.out.println("inside if");
                result = new ListNode(root.val, x);
            }else{
                System.out.println("inside else");
                while(x.next != null){
                    if(x.next.val > root.val)
                        break;
                    x = x.next;
                }
                x.next = new ListNode(root.val,x.next);
            }
            root = root.next;
        }

        while(result != null){
            System.out.println(result.val);
            result = result.next;
        }

    }
}
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}