package banuelos.chavez.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val USUARIO_REGISTRADO = "Luis"
    val PASS_USUARIO = "hola123"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btningresar.setOnClickListener {
            //Obteniendo los datos de la vista
            val usuario = editTextUsuario.text.toString()
            val pass = editTextPassword.text.toString()

            if(!cadenaVacia(usuario) and !cadenaVacia(pass)) {
                if (verificarDatos(usuario,pass)){
                    mensaje("bienvenido")
                }else{
                    mensaje("Datos incorrectos")
                }
            }else{
                mensaje("Datos Vacios")

            }
        }
        }
        fun verificarDatos(usuario:String, pass:String):Boolean{
            return usuario.equals(USUARIO_REGISTRADO) and pass.equals(PASS_USUARIO)

        }

        /*
         * Metodo que nos ayuda a mostrar toasts*/
        fun mensaje(mensaje:String){ //mostrar mensajes
            Toast.makeText(this,mensaje,Toast.LENGTH_LONG).show()
        }
        /*
         * Metodo para verificar que una cadena este vacia
         * */
        fun cadenaVacia(cadenaVerificar:String):Boolean{
        return cadenaVerificar.isEmpty()
    }

    /*
    *1.- leer usuario
    *2.- leer contraseña
    *3.-Verificar que no esten vacios
    *4.-Comparar el usuario con un usuario permitido
    *5.-Comparar la contraseña con la contraseña del usuario
    *6.-Si el usuario es correcto damos un mensaje de bienvenida
    *de lo contrario, pedimos nuevamente los datos.
     */


}
