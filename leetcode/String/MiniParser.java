/**
 * // This is the interface that allows for creating nested lists.
 * // You should not implement it, or speculate about its implementation
 * public interface NestedInteger {
 *     // Constructor initializes an empty nested list.
 *     public NestedInteger();
 *
 *     // Constructor initializes a single integer.
 *     public NestedInteger(int value);
 *
 *     // @return true if this NestedInteger holds a single integer, rather than a nested list.
 *     public boolean isInteger();
 *
 *     // @return the single integer that this NestedInteger holds, if it holds a single integer
 *     // Return null if this NestedInteger holds a nested list
 *     public Integer getInteger();
 *
 *     // Set this NestedInteger to hold a single integer.
 *     public void setInteger(int value);
 *
 *     // Set this NestedInteger to hold a nested list and adds a nested integer to it.
 *     public void add(NestedInteger ni);
 *
 *     // @return the nested list that this NestedInteger holds, if it holds a nested list
 *     // Return empty list if this NestedInteger holds a single integer
 *     public List<NestedInteger> getList();
 * }
 */
class Solution {
    // use global integer
    int i=0;    
    public NestedInteger deserialize(String s) {        
        return helper(s);
    }

    private NestedInteger helper(String s) {
        if (s.charAt(i)=='[') {
            NestedInteger ni = new NestedInteger();
            i++;
            if (s.charAt(i)!=']') {
                while (true) {
                    ni.add(helper(s));
                    if (i<s.length() && s.charAt(i)==',') {
                        i++;
                    } else break;
                }
            }
            // expecting ']'. skip it over
            i++;
            return ni;
        } else {
            int value = 0;
            boolean negative  = false;
            if (s.charAt(i) == '-') { 
                negative = true; 
                i++;
            }
            while (i<s.length() && Character.isDigit(s.charAt(i))) {
                value = value*10 + s.charAt(i) - '0';                
                i++;
            }
            if (negative) value = -value;
            NestedInteger ni = new NestedInteger(value);            
            return ni;
        }
    }
}
