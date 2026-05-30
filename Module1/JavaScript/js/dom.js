// Heading

const heading =
    document.getElementById(
        "mainHeading"
    );

// Change Heading Color

heading.style.color =
    "#2980b9";

// Feedback Counter

const feedbackText =
    document.getElementById(
        "feedbackText"
    );

feedbackText.addEventListener(
    "keyup",
    function () {

        const count =
            feedbackText.value.length;

        document.getElementById(
            "charCount"
        ).innerText = count;

    }
);