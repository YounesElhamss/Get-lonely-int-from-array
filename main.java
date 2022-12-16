 public static int lonelyinteger(List<Integer> a) {
    
    for (int i = 0; i < a.size(); i++) { 
        int count = 0;
        
        for (int j = 0; j < a.size(); j++) {
            if (a.get(i) == a.get(j)) {
                count++;
            }
        }
        if (count == 1) {
            return a.get(i);
        }
    }
    return -1;
    }

}
