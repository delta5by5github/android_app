import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var strategySpinner: Spinner
    private lateinit var enterButton: Button
    private lateinit var displayTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize views
        strategySpinner = findViewById(R.id.strategySpinner)
        enterButton = findViewById(R.id.enterButton)
        displayTextView = findViewById(R.id.displayTextView)

        // Define an array of reading comprehension strategies
        val strategies = arrayOf(
            "Previewing",
            "Summarizing",
            "Questioning",
            "Visualizing",
            // Add more strategies here
        )

        // Create an ArrayAdapter for the spinner
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, strategies)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        // Set the ArrayAdapter to the spinner
        strategySpinner.adapter = adapter

        // Set a click listener for the enter button
        enterButton.setOnClickListener {
            val selectedStrategy = strategySpinner.selectedItem.toString()
            val currentText = displayTextView.text.toString()

            // Append the selected strategy to the TextView
            val newText = if (currentText.isEmpty()) {
                selectedStrategy
            } else {
                "$currentText\n$selectedStrategy"
            }
            displayTextView.text = newText
        }
    }
}
