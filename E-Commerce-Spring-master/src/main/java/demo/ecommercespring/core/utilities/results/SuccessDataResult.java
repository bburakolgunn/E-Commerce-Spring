package demo.ecommercespring.core.utilities.results;

public class SuccessDataResult<T> extends DataResult<T> {

    //<T> generic yapı bizim için sonuçta data çünkü ne döndüreceğimiz belli değil,
    //kategori listesi olabilir,ürün olabilir,kategori olabilir.


    public SuccessDataResult(T data, String message) {
        super(data,true,message);
    }

    public SuccessDataResult(T data){
        super(data,true);
    }

    public SuccessDataResult(String message) {
        super(null,true,message);
    }

    public SuccessDataResult() {
        super(null,true);
    }

}
