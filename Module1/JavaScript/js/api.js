// Fetch API

async function fetchPosts() {

    try {

        const response =
            await fetch(
                "https://jsonplaceholder.typicode.com/posts"
            );

        const data =
            await response.json();

        console.log(data);

    }

    catch(error) {

        console.log(error);

    }

}

// Call Function

fetchPosts();