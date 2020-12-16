package com.example.calculator

        import androidx.appcompat.app.AppCompatActivity
                import android.os.Bundle
                import android.widget.Button
                import android.widget.EditText
                import android.widget.TextView


class MainActivity : AppCompatActivity() {
            override fun onCreate(savedInstanceState: Bundle?) {
                super.onCreate(savedInstanceState)
                setContentView(R.layout.constraint_layout)

                var one: EditText= findViewById(R.id.one)
                var two: EditText= findViewById(R.id.two)
                var add: Button= findViewById(R.id.add)
                var sub: Button= findViewById(R.id.sub)
                var mul: Button = findViewById(R.id.mul)
                var div: Button = findViewById(R.id.div)
                var ans : TextView = findViewById(R.id.result)


                add.setOnClickListener {
                    var result = one.text.toString().toDouble() + two.text.toString().toDouble()
                    ans.text=result.toString()
                }

                sub.setOnClickListener {
                    var result = one.text.toString().toDouble() - two.text.toString().toDouble()
                    ans.text=result.toString()
                }
                mul.setOnClickListener {
                    var result = one.text.toString().toDouble() *two.text.toString().toDouble()
                    ans.text=result.toString()
                }

                div.setOnClickListener {
                    var result = one.text.toString().toDouble() / two.text.toString().toDouble()
                    ans.text=result.toString()
                }

            }
        }



