class Solution {
    public boolean hasDuplicate(int[] nums) {
        
      Set<Integer> unique = new HashSet<Integer>();
      Set<Integer> duplicate = new HashSet<Integer>();
      
      for(int num : nums)
      {
   
       if(!unique.add(num))
       {
         return true;
       }

      }
      return false;

    }
}