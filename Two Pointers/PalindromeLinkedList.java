/*
 * Given a singly linked list, determine if it is a palindrome.
 */
 
 public class PalindromeLinkedList {  
    // Time complexity O(n). Space complexity O(n).
    public boolean isPalindrome1(ListNode head) {
        if(head == null || head.next == null)
            return true;
        
        ListNode mid = findListMiddle(head);
        ListNode midhead = mid.next;
        ListNode reverseHead = reverseList(midhead);
        
        while(reverseHead!=null){
            if(head.val==reverseHead.val){
                head = head.next;
                reverseHead = reverseHead.next;
            }else{
                return false;
            }
        }
        
        return true;
    }
    
    //Time complexity O(n). Space complexity O(1)
    public boolean isPalindrome2(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        
        if (fast != null) { // odd nodes: let right half smaller
            slow = slow.next;
        }
        slow = reverse(slow);
        fast = head;
        
        while (slow != null) {
        if (fast.val != slow.val) {
            return false;
        }
        fast = fast.next;
        slow = slow.next;
        }
        return true;
    }
    
    private ListNode reverse(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
 }
