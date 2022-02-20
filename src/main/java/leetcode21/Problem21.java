package leetcode21;

import listNode.ListNode;

public class Problem21 {
    public ListNode mergerTwoList(ListNode list1, ListNode list2) {
        ListNode head = new ListNode();
        ListNode newListNode = head;
        ListNode l1 = list1;
        ListNode l2 = list2;

        while (l1 != null && l2 !=null){
            if(l1.val < l2.val) {
                    newListNode.next = new ListNode(l1.val, l1);
                    l1 = l1.next;

            } else {
                    newListNode.next = new ListNode(l2.val, l2);
                    l2 = l2.next;
            }
            newListNode = newListNode.next;
        }

        if(l2 != null) {
            l1 = l2;
        }

        while (null != l1){
            if(null != l1.next ){
                newListNode.next = new ListNode(l1.val, l1);
            } else {
                newListNode.next = new ListNode(l1.val);
            }

            l1= l1.next;
            newListNode = newListNode.next;
        }

        return head.next;
    }


    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode();
        ListNode itr = dummy;
        ListNode itr1 = list1;
        ListNode itr2 = list2;
        while(itr1!=null && itr2!=null){
            if(itr1.val<itr2.val){
                itr.next = new ListNode(itr1.val);
                itr1=itr1.next;
            }
            else{
                itr.next = new ListNode(itr2.val);
                itr2=itr2.next;
            }
            itr = itr.next;
        }
        if(itr2!=null) itr1 = itr2;

        while(itr1!=null){
            itr.next = new ListNode(itr1.val);
            itr=itr.next;
            itr1 = itr1.next;
        }
        return dummy.next;
    }
}
