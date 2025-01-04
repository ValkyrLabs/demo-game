
import { 
    getAttack, 
    postAttack,
    getAttackList , 
    deleteAttack , 
    updateAttack 
} from '../../api';

import {

    ADD_ATTACK_REQUEST,
    FETCH_ATTACK_REQUEST,
    LIST_ATTACK_REQUEST,
    UPDATE_ATTACK_REQUEST,
    DELETE_ATTACK_REQUEST,

    addAttackFailure,
    addAttackSuccess,

    fetchAttackFailure,
    fetchAttackSuccess,
    
    listAttackFailure,
    listAttackSuccess,

    updateAttackFailure,
    updateAttackSuccess,
    
    deleteAttackFailure,
    deleteAttackSuccess,
    
} from '../actions/AttackApiAction';

/**
############################## DO NOT EDIT: GENERATED FILE ##############################

Generated by Valkyr Labs ThorAPI: https://valkyrlabs.com

Powered by Swagger Codegen: http://swagger.io

Generator version: (7.5.0)

Template file: typescript-redux-query/apiREST.mustache

############################## DO NOT EDIT: GENERATED FILE ##############################

Description: Attack
*/

export const AttackMiddleware = ({ dispatch }) => (next) => async (action) => {
    console.log("Attack MIDDLEWARE: " + JSON.stringify(action) )
    next(action);

    switch (action.type) {

        case ADD_ATTACK_REQUEST:
            try {
                const response = postAttack(action.payload);
                dispatch(addAttackSuccess(response.body));
            } catch (error) {
                dispatch(addAttackFailure(error.message));
            }
            break;

        case LIST_ATTACK_REQUEST:
            try {
                const response = getAttackList();
                dispatch(listAttackSuccess(response.body));
            } catch (error) {
                dispatch(listAttackFailure(error.message));
            }
            break;


        case FETCH_ATTACK_REQUEST:
            try {
                const response = getAttack(action.id);
                dispatch(fetchAttackSuccess(response.body));
            } catch (error) {
                dispatch(fetchAttackFailure(error.message));
            }
            break;

        case UPDATE_ATTACK_REQUEST:
            try {
                const { id, Attack } = action.payload;
                const response = updateAttack(id);
                dispatch(updateAttackSuccess(response.body));
            } catch (error) {
                dispatch(updateAttackFailure(error.message));
            }
            break;

        case DELETE_ATTACK_REQUEST:
            try {
                const { id, Attack } = action.payload;
                const response = deleteAttack(id);
                dispatch(deleteAttackSuccess(response.body));
            } catch (error) {
                dispatch(deleteAttackFailure(error.message));
            }
            break;

        default:
            break;
    }
};

