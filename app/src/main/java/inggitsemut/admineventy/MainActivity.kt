package inggitsemut.admineventy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import es.dmoral.toasty.Toasty
import inggitsemut.admineventy.Presenter.ILoginPresenter
import inggitsemut.admineventy.Presenter.LoginPresenter
import inggitsemut.admineventy.View.ILoginView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), ILoginView {

    override fun onLoginResult(message: String) {
        Toasty.info(this, message, Toast.LENGTH_SHORT).show()

    }

    internal lateinit var loginPresenter: ILoginPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // init
        loginPresenter = LoginPresenter(this)

        // event
        btn_login.setOnClickListener {
           loginPresenter.onLogin(et_email.text.toString(), et_password.text.toString())
        }

    }

}
