package com.example.validadormvp;

public class ValidationPresenter {
    private IViewPresenter iViewPresenter;
    private ValidationModel validationModel;

    public ValidationPresenter(IViewPresenter iViewPresenter) {
        this.iViewPresenter= iViewPresenter;
        this.validationModel= new ValidationModel();
    }
    public void checkSegurity(String password){
        validationModel.validateSegurity(password);
    }
}
