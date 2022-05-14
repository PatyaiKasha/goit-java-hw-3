class ATM {
    public int countBanknotes(int sum) {
        int[] banknotes = {500, 200, 100, 50, 20, 10, 5, 2, 1};
        int count = 0;
        int i = 0;
        while (i < banknotes.length) {
            count += sum / banknotes[i];
            sum %= banknotes[i];

            i++;
        }
        return count;
    }
}
