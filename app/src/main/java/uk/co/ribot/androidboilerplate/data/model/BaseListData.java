package uk.co.ribot.androidboilerplate.data.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/3/28.
 */
public class BaseListData<T> extends CommonData {
    public List<T> result;

    public List<T> getResult() {
        return result;
    }

    public void setResult(List<T> result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "BaseListData{" +
                "result=" + result +
                '}';
    }
}
