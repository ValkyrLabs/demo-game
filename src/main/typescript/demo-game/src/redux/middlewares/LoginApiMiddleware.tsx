
import {
    deleteLogin,
    getLogin,
    getLoginList,
    postLogin,
    updateLogin
} from '../../api';

import {
    ADD_LOGIN_REQUEST,
    DELETE_LOGIN_REQUEST,
    FETCH_LOGIN_REQUEST,
    LIST_LOGIN_REQUEST,
    UPDATE_LOGIN_REQUEST,
    addLoginFailure,
    addLoginSuccess,
    deleteLoginFailure,
    deleteLoginSuccess,
    fetchLoginFailure,
    fetchLoginSuccess,

    listLoginFailure,
    listLoginSuccess,

    updateLoginFailure,
    updateLoginSuccess,
} from '../actions/LoginApiAction';

/**
############################## DO NOT EDIT: GENERATED FILE ##############################

Generated by Peragon Games ThorAPI: https://valkyrlabs.com

Powered by Swagger Codegen: http://swagger.io

Generator version: (7.5.0)

Template file: typescript-redux-query/apiREST.mustache

############################## DO NOT EDIT: GENERATED FILE ##############################

Description: Login
*/

export const LoginMiddleware = ({ dispatch }) => (next) => async (action) => {
    console.log("Login MIDDLEWARE: " + JSON.stringify(action) )
    next(action);

    switch (action.type) {

        case ADD_LOGIN_REQUEST:
            try {
                const response = postLogin(action.payload);
                dispatch(addLoginSuccess(response.body));
            } catch (error) {
                dispatch(addLoginFailure(error.message));
            }
            break;

        case LIST_LOGIN_REQUEST:
            try {
                const response = getLoginList();
                dispatch(listLoginSuccess(response.body));
            } catch (error) {
                dispatch(listLoginFailure(error.message));
            }
            break;


        case FETCH_LOGIN_REQUEST:
            try {
                const response = getLogin(action.id);
                dispatch(fetchLoginSuccess(response.body));
            } catch (error) {
                dispatch(fetchLoginFailure(error.message));
            }
            break;

        case UPDATE_LOGIN_REQUEST:
            try {
                const { id, Login } = action.payload;
                const response = updateLogin(id);
                dispatch(updateLoginSuccess(response.body));
            } catch (error) {
                dispatch(updateLoginFailure(error.message));
            }
            break;

        case DELETE_LOGIN_REQUEST:
            try {
                const { id, Login } = action.payload;
                const response = deleteLogin(id);
                dispatch(deleteLoginSuccess(response.body));
            } catch (error) {
                dispatch(deleteLoginFailure(error.message));
            }
            break;

        default:
            break;
    }
};

