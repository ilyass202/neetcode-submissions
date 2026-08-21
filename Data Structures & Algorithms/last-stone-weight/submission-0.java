class Solution {
    public int lastStoneWeight(int[] stones) {
        List<Integer> stoneList = new ArrayList<>();
        for(int stone: stones){
            stoneList.add(stone);
        }
        while(stoneList.size() > 1){
            Collections.sort(stoneList);
            int diff = stoneList.remove(stoneList.size() - 1) - 
            stoneList.remove(stoneList.size() - 1);
            if(diff != 0){
                  stoneList.add(diff);
            }
        }
        return stoneList.isEmpty() ? 0 : stoneList.get(0);
    }
}
