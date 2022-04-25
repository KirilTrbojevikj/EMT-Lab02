import React from "react";
import BooksTerm from "../BooksTerm/booksTerm";

const books = (props) => {

    return (
        <div className={"container mm-4 mt-5"}>
            <div className={"row"}>
                <div className={"table-responsive"}>
                    <table className={"table table-striped"}>
                        <thead>
                        <tr>
                            <th scope={"col"}>Title</th>
                            <th scope={"col"}>Author</th>
                            <th scope={"col"}>Category</th>
                            <th scope={"col"}>Country</th>
                        </tr>
                        </thead>
                        <tbody>
                        {props.books.map((term) => {
                            return (
                               <BooksTerm term={term} />
                            )
                        })}
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
    );

}

export default books;