class ATM {

    int[] banknotesCount;
    int[] banknotes = {20, 50, 100, 200, 500};

    public ATM() {
        banknotesCount = new int[5];
    }
    
    public void deposit(int[] banknotesCount) {
        for(int i = 0; i < 5; i++){
            this.banknotesCount[i] += banknotesCount[i];
        }
    }
    
    public int[] withdraw(int amount) {
        int[] ans = new int[5];
        int[] temp = new int[5];

        for(int i = 0;i < 5;i++){
            temp[i] = banknotesCount[i];
        }

        for(int i = 4;i >= 0;i--){
            int val = Math.min(amount / banknotes[i], banknotesCount[i]);

            amount -= val * banknotes[i];

            banknotesCount[i] -= val;

            ans[i] = val;
        }

        if(amount != 0){

            banknotesCount = temp;

            return new int[]{-1};
        }

        return ans;
    }
}
