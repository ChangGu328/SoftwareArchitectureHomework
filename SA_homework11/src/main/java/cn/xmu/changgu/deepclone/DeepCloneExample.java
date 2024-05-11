package cn.xmu.changgu.deepclone;

public class DeepCloneExample implements Cloneable {
    private int data;
    private Integer[] dataArray;

    public DeepCloneExample(int data, Integer[] dataArray) {
        this.data = data;
        this.dataArray = dataArray.clone();  // 在构造函数中创建数组的副本
    }

    @Override
    public DeepCloneExample clone() {
        try {
            DeepCloneExample cloned = (DeepCloneExample) super.clone();
            cloned.dataArray = this.dataArray.clone();  // 在克隆方法中创建数组的副本
            return cloned;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    public static void main(String[] args) {
        Integer[] dataArray = {1, 2, 3};
        DeepCloneExample original = new DeepCloneExample(100, dataArray);
        DeepCloneExample cloned = original.clone();

        cloned.dataArray[0] = 1000;  // 修改克隆对象的数组元素

        System.out.println("Original array first element: " + original.dataArray[0]);
        // 输出：Original array first element: 1
    }
}
