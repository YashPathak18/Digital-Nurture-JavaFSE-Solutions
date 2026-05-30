// Save Preference

function savePreference() {

    const preferredEvent =
        document.getElementById(
            "preferredEvent"
        ).value;

    localStorage.setItem(
        "preferredEvent",
        preferredEvent
    );

    alert(
        "Preference Saved"
    );

}

// Load Preference

window.onload = function () {

    const savedPreference =
        localStorage.getItem(
            "preferredEvent"
        );

    if (savedPreference) {

        document.getElementById(
            "preferredEvent"
        ).value =
        savedPreference;

    }

};