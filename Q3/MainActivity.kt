import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var resultTextView: TextView
    private var currentInput: String = ""
    private var operand1: Double = 0.0
    private var operator: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize views
        resultTextView = findViewById(R.id.resultTextView)

        // Set click listeners for digit buttons (0-9)
        val digitButtonIds = listOf(
            R.id.button0, R.id.button1, R.id.button2, R.id.button3, R.id.button4,
            R.id.button5, R.id.button6, R.id.button7, R.id.button8, R.id.button9
        )
        for (buttonId in digitButtonIds) {
            val digitButton = findViewById<Button>(buttonId)
            digitButton.setOnClickListener { onDigitClick(digitButton) }
        }

        // Set click listeners for operator buttons (+, -, *, /)
        val operatorButtonIds = listOf(
            R.id.buttonPlus, R.id.buttonMinus, R.id.buttonMultiply, R.id.buttonDivide
        )
        for (buttonId in operatorButtonIds) {
            val operatorButton = findViewById<Button>(buttonId)
            operatorButton.setOnClickListener { onOperatorClick(operatorButton) }
        }

        // Set click listener for equals button (=)
        val equalsButton = findViewById<Button>(R.id.buttonEquals)
        equalsButton.setOnClickListener { onEqualsClick() }
    }

    private fun onDigitClick(button: Button) {
        currentInput += button.text
        updateResultText()
    }

    private fun onOperatorClick(button: Button) {
        operand1 = currentInput.toDouble()
        operator = button.text.toString()
        currentInput = ""
        updateResultText()
    }

    private fun onEqualsClick() {
        if (currentInput.isNotEmpty()) {
            val operand2 = currentInput.toDouble()
            val result = performOperation(operand1, operand2, operator)
            currentInput = result.toString()
            operator = ""
            updateResultText()
        }
    }

    private fun performOperation(operand1: Double, operand2: Double, operator: String): Double {
        return when (operator) {
            "+" -> operand1 + operand2
            "-" -> operand1 - operand2
            "*" -> operand1 * operand2
            "/" -> operand1 / operand2
            else -> 0.0
        }
    }

    private fun updateResultText() {
        resultTextView.text = if (currentInput.isEmpty()) "0" else currentInput
    }
}
