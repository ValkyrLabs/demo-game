import { ErrorMessage, Field, Formik, FormikHelpers, FormikValues } from 'formik';
import React from 'react';
import { Col, Row, Spinner } from 'react-bootstrap';
import { FaCheckCircle } from 'react-icons/fa';
import * as Yup from 'yup';
import CoolButton from '../../../components/CoolButton';

import { Logout } from '../../../thor/model';
import { useAddLogoutMutation } from '../../services/LogoutService';

/**
############################## DO NOT EDIT: GENERATED FILE ##############################

Generated by Peragon Games ThorAPI: https://valkyrlabs.com

Powered by Swagger Codegen: http://swagger.io

Generated Details:
**GENERATOR VERSION:** 7.5.0
**GENERATED DATE:** 2024-10-22T12:32:44.494498-07:00[America/Los_Angeles]
**GENERATOR CLASS:** org.openapitools.codegen.languages.TypeScriptReduxQueryClientCodegen

Template file: typescript-redux-query/modelForm.mustache

############################## DO NOT EDIT: GENERATED FILE ##############################

Description: Logout
*/

{/* MUSTACHE FORM VALIDATIONS */}
const validationSchema = Yup.object().shape({

    description : Yup.string()
    ,
id : Yup.string()
    ,
ownerId : Yup.string()
    ,
createdDate : Yup.date()
    ,
keyHash : Yup.string()
    ,
lastAccessedById : Yup.string()
    ,
lastAccessedDate : Yup.date()
    ,
lastModifiedById : Yup.string()
    ,
lastModifiedDate : Yup.date()
    ,

});

const LogoutForm: React.FC = () => {
  const [addLogout, addUserResult] = useAddLogoutMutation();

  const initialValues: Logout = {
    
    description : 'null',
    
    id : 'b12ab960-2d4d-478b-ae91-2d6c879f21b5',
    
    ownerId : 'c4b44096-7141-4a89-b06f-606c750b052f',
    
    
    keyHash : 'null',
    
    lastAccessedById : 'cedeaf29-8b3e-42ee-867f-43dc30cdc8f3',
    
    
    lastModifiedById : '37ed73e2-eb83-462e-815e-3a938d829adf',
    
    
  };

  const handleSubmit = (values: FormikValues,
    { setSubmitting }: FormikHelpers<Logout>) => {
    setTimeout(() => {
      console.log(values);
      addLogout(values);
      setSubmitting(false);
    }, 500);
  }

  return (
    <div>
      <Formik
        validateOnBlur={true}
        initialValues={initialValues}
        validationSchema={validationSchema}
        onSubmit={handleSubmit}
      >
        {({ isSubmitting, isValid, errors, setFieldValue, touched, setFieldTouched, handleSubmit }) => (
          <form onSubmit={handleSubmit} className="form">
{/* MUSTACHE FORM FIELDS */}

    
{/* begin iterating */}

          {/* TEXT FIELD */}
                  <Row>
                        <Col md={12}>
                          <label htmlFor="description" className="nice-form-control">
                            <b>Description: {touched.description && !errors.description && (<span className="okCheck"><FaCheckCircle /> looks good!</span>)}</b>
                            <Field name="description" type="text"
                              className={errors.description ? 'form-control field-error' : ' nice-form-control form-control'} />
                            <ErrorMessage className='error' name="description" component="span" />

                          </label>
                        </Col>
                      </Row>
        

{/* begin iterating */}

          {/* TEXT FIELD */}
                  <Row>
                        <Col md={12}>
                          <label htmlFor="id" className="nice-form-control">
                            <b>Id: {touched.id && !errors.id && (<span className="okCheck"><FaCheckCircle /> looks good!</span>)}</b>
                            <Field name="id" type="text"
                              className={errors.id ? 'form-control field-error' : ' nice-form-control form-control'} />
                            <ErrorMessage className='error' name="id" component="span" />

                          </label>
                        </Col>
                      </Row>
        

{/* begin iterating */}

          {/* TEXT FIELD */}
                  <Row>
                        <Col md={12}>
                          <label htmlFor="ownerId" className="nice-form-control">
                            <b>Owner Id: {touched.ownerId && !errors.ownerId && (<span className="okCheck"><FaCheckCircle /> looks good!</span>)}</b>
                            <Field name="ownerId" type="text"
                              className={errors.ownerId ? 'form-control field-error' : ' nice-form-control form-control'} />
                            <ErrorMessage className='error' name="ownerId" component="span" />

                          </label>
                        </Col>
                      </Row>
        

{/* begin iterating */}

        

{/* begin iterating */}

          {/* TEXT FIELD */}
                  <Row>
                        <Col md={12}>
                          <label htmlFor="keyHash" className="nice-form-control">
                            <b>Key Details: {touched.keyHash && !errors.keyHash && (<span className="okCheck"><FaCheckCircle /> looks good!</span>)}</b>
                            <Field name="keyHash" type="text"
                              className={errors.keyHash ? 'form-control field-error' : ' nice-form-control form-control'} />
                            <ErrorMessage className='error' name="keyHash" component="span" />

                          </label>
                        </Col>
                      </Row>
        

{/* begin iterating */}

          {/* TEXT FIELD */}
                  <Row>
                        <Col md={12}>
                          <label htmlFor="lastAccessedById" className="nice-form-control">
                            <b>Last Accessed By Id: {touched.lastAccessedById && !errors.lastAccessedById && (<span className="okCheck"><FaCheckCircle /> looks good!</span>)}</b>
                            <Field name="lastAccessedById" type="text"
                              className={errors.lastAccessedById ? 'form-control field-error' : ' nice-form-control form-control'} />
                            <ErrorMessage className='error' name="lastAccessedById" component="span" />

                          </label>
                        </Col>
                      </Row>
        

{/* begin iterating */}

        

{/* begin iterating */}

          {/* TEXT FIELD */}
                  <Row>
                        <Col md={12}>
                          <label htmlFor="lastModifiedById" className="nice-form-control">
                            <b>Last Modified By Id: {touched.lastModifiedById && !errors.lastModifiedById && (<span className="okCheck"><FaCheckCircle /> looks good!</span>)}</b>
                            <Field name="lastModifiedById" type="text"
                              className={errors.lastModifiedById ? 'form-control field-error' : ' nice-form-control form-control'} />
                            <ErrorMessage className='error' name="lastModifiedById" component="span" />

                          </label>
                        </Col>
                      </Row>
        

{/* begin iterating */}

        

            

            <CoolButton
              variant={(touched && isValid) ? (isSubmitting ? 'disabled' : 'success') : 'warning'}
              disabled={!(touched && isValid && (addUserResult.status == 'uninitialized'))}
              type="submit"
              onClick={ ()=>{} }
              >
              {isSubmitting && (
                <Spinner
                  style={ { float: "left" } }
                  as="span"
                  animation="grow"
                  variant="light"
                  aria-hidden="true"
                />
              )}
              <FaCheckCircle size={30} /> Save Changes
            </CoolButton>
          </form>
        )}
    </Formik>
    </div >
  );
};

export default LogoutForm;