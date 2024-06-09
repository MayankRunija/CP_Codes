class Solution {
    public int numDifferentIntegers(String word) {
        int l = word.length();
        if (l == 1) {
            return word.charAt(0) <= '9' ? 1 : 0;
        }
        
        // -- Solution 1:
        char[] arr = word.toCharArray();
     
        if ((arr[0] == '0' && arr[1] <= '9') || arr[0] > '9') {
            arr[0] = ' ';
        }

        for (int i = 1; i < l; i++) {
            if (i < l - 1 && arr[i] == '0' && arr[i - 1] == ' ' && arr[i + 1] <= '9') {
                arr[i] = ' ';
            } else if (arr[i] > '9') {
                arr[i] = ' ';
            }
        }
        // -- Solution 1.1:
        HashSet<String> set = new HashSet<>();
        StringBuilder num = new StringBuilder();
        for (char c : arr) {
            if (c != ' ') {
                num.append(c);
            } else if (num.length() > 0) {
                set.add(num.toString());
                num.setLength(0);
            }
        }
        if (num.length() > 0) {
            set.add(num.toString());
        }
        return set.size();
        
        // -- Solution 1.2:
        // HashSet<String> set = new HashSet<>();
        // StringBuilder num = new StringBuilder();
        // for (int i = 0; i < l; i++) {
        //     if (arr[i] != ' ') {
        //         num.append(arr[i]);
        //     } else if (num.length() > 0) {
        //         set.add(num.toString());
        //         num.setLength(0);
        //     }
        // }
        // if (num.length() > 0) {
        //     set.add(num.toString());
        // }
        // return set.size();
        
        //-- Solution 1.3: 
        // HashSet<String> set = new HashSet<>();
        // int j = 0;
        // for (int i = 0; i < l; i++) {
        //     if (arr[i] >= '0' && arr[i] <= '9') {
        //         j = i;
        //         while (j < l && arr[j] >= '0' && arr[j] <= '9') {
        //             j++;
        //         }
        //         set.add(word.substring(i, j)); 
        //         i = j;
        //     } 
        // }       
        // return set.size();

    
        // -- Solution 2:
        // HashSet<String> set = new HashSet<>();
        // int i = 0, j = 0;
        // while (i < l) {
        //     if (word.charAt(i) <= '9') {
        //         j = i;
        //         while (j < l && word.charAt(j) <= '9') {
        //             j++;
        //         }
        //         String num = word.substring(i, j);
        //         set.add(num.replaceFirst("^0+(?!$)", "")); 
        //         i = j;
        //     } else {
        //         i++;
        //     }
        // }
        // return set.size();


        // -- Solution 3:
        // String arr = word.chars().mapToObj(c -> (char)c <= '9' ? (char)c : ' ')
        //                        .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append)
        //                        .toString();
        // String[] brr = arr.split(" ");
        // return (int)Arrays.stream(brr)
        //                   .filter(num -> !num.isEmpty())
        //                   .map(num -> num.replaceFirst("^0+(?!$)", ""))
        //                   .distinct()
        //                   .count();

        // -- Solution 4:
        // String arr = word.chars().mapToObj(c -> (char)c <= '9' ? (char)c : ' ')
        //                        .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append)
        //                        .toString();
        // String[] brr = arr.split(" ");
        // HashSet<String> set = new HashSet<>();
        // for (String num : brr) {
        //     if (!num.isEmpty()) {
        //         set.add(num.replaceFirst("^0+(?!$)", ""));
        //     }
        // }
        // return set.size();
    }
}
