package uk.co.ribot.androidboilerplate.data.model;

/**
 * Created by Administrator on 2016/3/25.
 */
public class BaseSingleData<T> extends CommonData {
    public T result;

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "BaseSingleData{" +
                "result=" + result +
                '}';
    }
}
