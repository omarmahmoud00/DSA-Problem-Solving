/**
 * Definition for singly-linked list.
 * class ListNode {
 *     val: number
 *     next: ListNode | null
 *     constructor(val?: number, next?: ListNode | null) {
 *         this.val = (val===undefined ? 0 : val)
 *         this.next = (next===undefined ? null : next)
 *     }
 * }
 */

function reverseList(head: ListNode | null): ListNode | null {
    let reversedList: ListNode | null = null;
    let prevNode: ListNode | null = null;
    let nextNode: ListNode | null = null;

    let current: ListNode | null = head;

    while (current !== null) {
        nextNode = current.next;

        current.next = prevNode;


        prevNode = current;
        current = nextNode;
    }

    reversedList = prevNode;

    return reversedList;
}
