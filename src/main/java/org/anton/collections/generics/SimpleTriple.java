package org.anton.collections.generics;

public class SimpleTriple<L,M,R> implements Triple<L,M,R> {

    private L left;
    private M middle;
    private R right;

    public SimpleTriple(final L left, final M middle, final R right) {
        this.left = left;
        this.middle = middle;
        this.right = right;
    }

    // Create generic method
    public SimpleTriple<R,M,L> reverse(){
        return new SimpleTriple<R,M,L>(right,middle,left);
    }

    public boolean isEqualTo(SimpleTriple<L,M,R> test) {
        return left.equals(test.left) && right.equals(test.right) && middle.equals(test.middle);
    }

    @Override
    public L getLeft() {
        return left;
    }

    @Override
    public M getMiddle() {
        return middle;
    }

    @Override
    public R getRight() {
        return right;
    }

    @Override
    public void setLeft(L left) {
        this.left=left;
    }

    @Override
    public void setMiddle(M middle) {
        this.middle=middle;
    }

    @Override
    public void setRight(R right) {
        this.right=right;
    }
}
