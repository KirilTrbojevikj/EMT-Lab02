import axios from '../custom-axios/axios';

const BookStoreService = {
    fetchBooks: () => {
        return axios.get("/books")
    },
    fetchCategories: () => {
        return axios.get("/categories")
    },


}

export default BookStoreService;