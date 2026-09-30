const registerForm = document.getElementById("registerForm");

registerForm.addEventListener("submit", async function (event) {

    event.preventDefault();

    const user = {
        name: document.getElementById("name").value,
        email: document.getElementById("email").value,
        password: document.getElementById("password").value
    };

    try {

        const response = await fetch("http://localhost:8080/users", {
            method: "POST",
            headers: {
                "Content-Type": "application/json"
            },
            body: JSON.stringify(user)
        });

        if (response.ok) {

            document.getElementById("message").innerText =
                "Registration successful!";

            registerForm.reset();

        } else {

            document.getElementById("message").innerText =
                "Registration failed!";

        }

    } catch (error) {

        console.error(error);

        document.getElementById("message").innerText =
            "Cannot connect to backend.";

    }

});