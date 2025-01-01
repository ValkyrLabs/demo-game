
import { 
    getProduct, 
    postProduct,
    getProductList , 
    deleteProduct , 
    updateProduct 
} from '../../api';

import {

    ADD_PRODUCT_REQUEST,
    FETCH_PRODUCT_REQUEST,
    LIST_PRODUCT_REQUEST,
    UPDATE_PRODUCT_REQUEST,
    DELETE_PRODUCT_REQUEST,

    addProductFailure,
    addProductSuccess,

    fetchProductFailure,
    fetchProductSuccess,
    
    listProductFailure,
    listProductSuccess,

    updateProductFailure,
    updateProductSuccess,
    
    deleteProductFailure,
    deleteProductSuccess,
    
} from '../actions/ProductApiAction';

/**
############################## DO NOT EDIT: GENERATED FILE ##############################

Generated by CARMINA GAMES ThorAPI: https://valkyrlabs.com

Powered by Swagger Codegen: http://swagger.io

Generator version: (7.5.0)

Template file: typescript-redux-query/apiREST.mustache

############################## DO NOT EDIT: GENERATED FILE ##############################

Description: Product
*/

export const ProductMiddleware = ({ dispatch }) => (next) => async (action) => {
    console.log("Product MIDDLEWARE: " + JSON.stringify(action) )
    next(action);

    switch (action.type) {

        case ADD_PRODUCT_REQUEST:
            try {
                const response = postProduct(action.payload);
                dispatch(addProductSuccess(response.body));
            } catch (error) {
                dispatch(addProductFailure(error.message));
            }
            break;

        case LIST_PRODUCT_REQUEST:
            try {
                const response = getProductList();
                dispatch(listProductSuccess(response.body));
            } catch (error) {
                dispatch(listProductFailure(error.message));
            }
            break;


        case FETCH_PRODUCT_REQUEST:
            try {
                const response = getProduct(action.id);
                dispatch(fetchProductSuccess(response.body));
            } catch (error) {
                dispatch(fetchProductFailure(error.message));
            }
            break;

        case UPDATE_PRODUCT_REQUEST:
            try {
                const { id, Product } = action.payload;
                const response = updateProduct(id);
                dispatch(updateProductSuccess(response.body));
            } catch (error) {
                dispatch(updateProductFailure(error.message));
            }
            break;

        case DELETE_PRODUCT_REQUEST:
            try {
                const { id, Product } = action.payload;
                const response = deleteProduct(id);
                dispatch(deleteProductSuccess(response.body));
            } catch (error) {
                dispatch(deleteProductFailure(error.message));
            }
            break;

        default:
            break;
    }
};

