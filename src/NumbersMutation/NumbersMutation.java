package NumbersMutation;

public class NumbersMutation {
    private Integer[] numbers;

    public Integer[] getNumbers() {
        return numbers;
    }

    public void setNumbers(Integer[] numbers) {
        this.numbers = numbers;
    }

    private Integer getSum() {
        Integer sum = 0;

        for (int i = 0; i < this.numbers.length; i++) {
            sum += numbers[i];
        }

        return sum;
    }

    public Float getAverage() {
        Integer sum = this.getSum();

        return  (sum / ((float) this.numbers.length));
    }

    public Integer getSmallest() {
        Integer smallest = this.numbers[0];

        for (int i = 0; i < this.numbers.length; i++) {
            if(this.numbers[i] > smallest) continue;

            smallest = numbers[i];
        }

        return smallest;
    }

    public Integer getBiggest() {
        Integer biggest = this.numbers[0];

        for (int i = 0; i < this.numbers.length; i++) {
            if(this.numbers[i] < biggest) continue;

            biggest = numbers[i];
        }

        return biggest;
    }


}
