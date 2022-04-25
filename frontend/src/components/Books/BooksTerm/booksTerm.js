import React from "react";

const booksTerm = (props) => {
    return (
        <tr>
            <td scope={"col"}>{props.term.name}</td>
            <td scope={"col"}>{props.term.author}</td>
            <td scope={"col"}>{props.term.category}</td>
            <td scope={"col"}>{props.term.country}</td>
        </tr>
    )
}

export default booksTerm;