package inggitsemut.admineventy.Presenter

import inggitsemut.admineventy.Model.User
import inggitsemut.admineventy.View.ILoginView

class LoginPresenter (internal var iLoginView:ILoginView) : ILoginPresenter {
    override fun onLogin(email:String, password:String){
        val user = User(email, password)
        val isLoginSuccess = user.isDataValid
        if(isLoginSuccess)
            iLoginView.onLoginResult("Login success")
        else
            iLoginView.onLoginResult("Login error")
    }
}