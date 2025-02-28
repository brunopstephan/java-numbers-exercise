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

        for (Integer number : this.numbers) {
            sum += number;
        }

        return sum;
    }

    public Float getAverage() {
        Integer sum = this.getSum();

        return  (sum / ((float) this.numbers.length));
    }

    public Integer getSmallest() {
        Integer smallest = this.numbers[0];

        for (Integer number : this.numbers) {
            if (number > smallest) continue;

            smallest = number;
        }

        return smallest;
    }

    public Integer getBiggest() {
        Integer biggest = this.numbers[0];

        for (Integer number : this.numbers) {
            if (number < biggest) continue;

            biggest = number;
        }

        return biggest;
    }


}
