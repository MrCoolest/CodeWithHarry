import React from "react";
// import "./footer.css"

export const Footer = () => {
    let footerStyle = {
        position: "relative",
        top: "60vh",
        width : "100%",
    }
    return (
        <footer className="bg-dark text-white py-3" style={footerStyle}>
            <p className="text-center pt-1">
            Copyright &copy; Code_with_ankit.com
            </p>
        </footer>

    )
}