const pairSum = head => {
    let slow = head, fast = head;
    let prev = null;

    while (fast && fast.next) {
        fast = fast.next.next;
        [slow.next, prev, slow] = [prev, slow, slow.next];
    }

    let res = 0;
    while (slow) {
        res = Math.max(res, prev.val + slow.val);
        [prev, slow] = [prev.next, slow.next];
    }

    return res;
};