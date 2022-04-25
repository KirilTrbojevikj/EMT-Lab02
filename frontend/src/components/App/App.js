import './App.css';
import React, {Component} from "react";
import Books from '../Books/BooksList/books';
import {BrowserRouter as Router, Redirect, Route} from "react-router-dom";
import BookStoreService from "../../repository/bookstoreRepository";
import Categories from "../Categories/categories";
import Header from "../Header/header";

class App extends Component {

    constructor(props) {
        super();
        this.state = {
            books: [],
            categories: [],
        }
    }

    render() {
        return (
            <Router>
                <Header/>
                <main>
                    <div className={"container"}>
                        <Route path={"/books"} exact render={() => <Books books={this.state.books}/>}/>
                        <Route path={"/categories"} exact render={() => <Categories categories={this.state.categories}/>}/>

                    </div>
                </main>
            </Router>
        )
    }

    loadBooks = () => {
        BookStoreService.fetchBooks()
            .then((data) => {
                this.setState({
                    books: data.data
                })
            });
    }

    loadCategories = () => {
        BookStoreService.fetchCategories()
            .then((data) => {
                this.setState({
                    categories: data.data
                })
            })
    }

    componentDidMount() {
        this.loadBooks();
        this.loadCategories();
    }
}

export default App;
