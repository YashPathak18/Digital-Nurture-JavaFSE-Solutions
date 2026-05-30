const events = [

    "Music Festival",
    "Community Marathon",
    "Tech Workshop"

];

function searchEvents() {

    const input =
        document.getElementById(
            "searchInput"
        ).value.toLowerCase();

    const container =
        document.getElementById(
            "eventContainer"
        );

    container.innerHTML = "";

    events
    .filter(event =>
        event.toLowerCase()
        .includes(input)
    )
    .forEach(event => {

        container.innerHTML += `

            <p>${event}</p>

        `;

    });

}