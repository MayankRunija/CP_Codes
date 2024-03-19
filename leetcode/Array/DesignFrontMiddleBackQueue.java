class FrontMiddleBackQueue {

    List<Integer> qList;

    public FrontMiddleBackQueue() {
        qList = new ArrayList<>();
    }

    public void pushFront(int val) {
        qList.add(0, val);
    }

    public void pushMiddle(int val) {
        int mid = qList.size()/2;
        qList.add(mid, val);
    }

    public void pushBack(int val) {
        qList.add(qList.size(), val);
    }

    public int popFront() {
        return qList.isEmpty()? -1 : qList.remove(0);
    }

    public int popMiddle() {
        return qList.isEmpty()? -1 : qList.remove((qList.size()-1)/2);
    }

    public int popBack() {
        return qList.isEmpty()? -1 : qList.remove(qList.size()-1);
    }
}
