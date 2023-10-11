class remove_duplicate_from_list {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode current=head;
        while(current!=null && current.next!=null)
        {
            if(current.val==current.next.val)
            {
                current.next=current.next.next;
            }
            else
            {
                current=current.next;
            }
        }
        return head;
    }
}