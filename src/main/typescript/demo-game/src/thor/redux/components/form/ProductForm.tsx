import { ErrorMessage, Field, Formik, FormikHelpers, FormikValues } from 'formik';
import React from 'react';
import { Form as BSForm, Accordion, Col, Nav, Row, Spinner } from 'react-bootstrap';
import { FaCheckCircle, FaCogs, FaRegPlusSquare } from 'react-icons/fa';
import CoolButton from '../../../../components/CoolButton';
import * as Yup from 'yup';
import { Product, ProductStatusEnum,  } from '../../../model';
import { useAddProductMutation } from '../../services/ProductService';

/**
############################## DO NOT EDIT: GENERATED FILE ##############################

Generated by CARMINA GAMES ThorAPI: https://valkyrlabs.com/thorapi

Powered by Swagger Codegen: http://swagger.io

Generated Details:
**GENERATOR VERSION:** 7.5.0
**GENERATED DATE:** 2024-12-30T08:46:46.125225-08:00[America/Los_Angeles]
**GENERATOR CLASS:** org.openapitools.codegen.languages.TypeScriptReduxQueryClientCodegen

Template file: typescript-redux-query/modelForm.mustache

############################## DO NOT EDIT: GENERATED FILE ##############################

Description: Product
*/

{/* ENUMS FOR FORM VALIDATIONS */}

    

const StatusValidation = () => { 
  return(
    [
      'available', 'discontinued', 'out_of_stock', 
    ]
  )
};



{/* MUSTACHE FORM VALIDATIONS */}
const validationSchema = Yup.object().shape({

     productId: Yup.string()
    
    
    .required('productId is required.')
    
    ,
     name: Yup.string()
    
    
    .required('name is required.')
    
    ,
     unitPrice: Yup.number()
    
    
    .required('unitPrice is required.')
    
    ,
     status: Yup.string().oneOf(StatusValidation(), 'Invalid value selected for status')
    
    
    .required('status is required.')
    
    ,
     description: Yup.string()
    
    
    
    
    ,
     id: Yup.string()
    
    
    
    
    ,
     ownerId: Yup.string()
    
    
    
    
    ,
     createdDate: Yup.date()
    
    
    
    
    ,
     keyHash: Yup.string()
    
    
    
    
    ,
     lastAccessedById: Yup.string()
    
    
    
    
    ,
     lastAccessedDate: Yup.date()
    
    
    
    
    ,
     lastModifiedById: Yup.string()
    
    
    
    
    ,
     lastModifiedDate: Yup.date()
    
    
    
    
    ,

});

const ProductForm: React.FC = () => {
  const [addProduct, addProductResult] = useAddProductMutation();

  const initialValues: Product = {
    
    
    productId : 'null',
    
    
    
    
    
    
    
    name : 'null',
    
    
    
    
    
    
    
    
    
    
    
    unitPrice : 0.00, 
    
        status :   ProductStatusEnum[Object.keys(ProductStatusEnum)[0]], 
    
    
    description : 'null',
    
    
    
    
    
    
    
    id : 'aa9c69e7-3efd-4d67-a7a5-f28ac3c70dd8',
    
    
    
    
    
    
    
    ownerId : '7edc4087-3029-4a05-9342-bcf83773c4f9',
    
    
    
    
    
    
    
    
    createdDate : new Date(), 
    
    
    
    
    
    
    keyHash : 'null',
    
    
    
    
    
    
    
    lastAccessedById : '2e1db6fe-11e2-465d-b332-9916b4d1b7df',
    
    
    
    
    
    
    
    
    lastAccessedDate : new Date(), 
    
    
    
    
    
    
    lastModifiedById : '777beccd-f44b-442e-bb48-5c7dd1dce485',
    
    
    
    
    
    
    
    
    lastModifiedDate : new Date(), 
    
    
    
    
    
  };

  const handleSubmit = (values: FormikValues,
    { setSubmitting }: FormikHelpers<Product>) => {
    setTimeout(() => {
      console.log(values);
      addProduct(values);
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

                    <Accordion
                      defaultActiveKey="1"
                    >
                      <Accordion.Item eventKey="0">
                        <Accordion.Header><FaCogs size={36}/></Accordion.Header>
                        <Accordion.Body>
                          errors: {JSON.stringify(errors)}
                          <br />
                          touched: {JSON.stringify(touched)}
                          <br />
                          addProductResult: {JSON.stringify(addProductResult)}
                        </Accordion.Body>
                      </Accordion.Item>

                      <Accordion.Item eventKey="1">
                        <Accordion.Header><FaRegPlusSquare  size={36}/> Add New Product</Accordion.Header>
                        <Accordion.Body>

        {/* MUSTACHE FORM FIELDS */}


        
            <label htmlFor="productId" className="nice-form-control">
              <b>Product Id: {touched.productId && !errors.productId && (<span className="okCheck"><FaCheckCircle /> looks good!</span>)}</b>
              
              
              
          
          {/* productId  TEXT FIELD */}
              <Field name="productId" type="text"
                className={errors.productId  ? 'form-control field-error' : ' nice-form-control form-control'} />    
                        <ErrorMessage className='error' name="productId" component="span" />
            </label>


        
            <label htmlFor="name" className="nice-form-control">
              <b>Name: {touched.name && !errors.name && (<span className="okCheck"><FaCheckCircle /> looks good!</span>)}</b>
              
              
              
          
          {/* name  TEXT FIELD */}
              <Field name="name" type="text"
                className={errors.name  ? 'form-control field-error' : ' nice-form-control form-control'} />    
                        <ErrorMessage className='error' name="name" component="span" />
            </label>


        
            <label htmlFor="unitPrice" className="nice-form-control">
              <b>Unit Price: {touched.unitPrice && !errors.unitPrice && (<span className="okCheck"><FaCheckCircle /> looks good!</span>)}</b>
              
              
              
          
          {/*unitPrice DATE FIELD */}
              <Field name="unitPrice" type="date"
                className={errors.unitPrice  ? 'form-control field-error' : ' nice-form-control form-control'} />
                        <ErrorMessage className='error' name="unitPrice" component="span" />
            </label>


        
            <label htmlFor="status" className="nice-form-control">
              <b>Status: {touched.status && !errors.status && (<span className="okCheck"><FaCheckCircle /> looks good!</span>)}</b>
              
              
              
                    {/* DROPDOWN FOR ENUM */}
              <BSForm.Select
                name="status"
                className={errors.status ? 'form-control field-error' : 'nice-form-control form-control'}
                onChange={e => {
                  setFieldTouched('status', true);
                  setFieldValue('status', e.target.value);
                }}
              >
                <option value="" label="Select Status" />
                <StatusLookup />
              </BSForm.Select>
              <ErrorMessage className='error' name="status" component="span" />
            </label>


        
            <label htmlFor="description" className="nice-form-control">
              <b>Description: {touched.description && !errors.description && (<span className="okCheck"><FaCheckCircle /> looks good!</span>)}</b>
              
              
              
          
          {/* description  TEXT FIELD */}
              <Field name="description" type="text"
                className={errors.description  ? 'form-control field-error' : ' nice-form-control form-control'} />    
                        <ErrorMessage className='error' name="description" component="span" />
            </label>


        
            <label htmlFor="id" className="nice-form-control">
              <b>Id: {touched.id && !errors.id && (<span className="okCheck"><FaCheckCircle /> looks good!</span>)}</b>
              
              
              
          
          {/* id  TEXT FIELD */}
              <Field name="id" type="text"
                className={errors.id  ? 'form-control field-error' : ' nice-form-control form-control'} />    
                        <ErrorMessage className='error' name="id" component="span" />
            </label>


        
            <label htmlFor="ownerId" className="nice-form-control">
              <b>Owner Id: {touched.ownerId && !errors.ownerId && (<span className="okCheck"><FaCheckCircle /> looks good!</span>)}</b>
              
              
              
          
          {/* ownerId  TEXT FIELD */}
              <Field name="ownerId" type="text"
                className={errors.ownerId  ? 'form-control field-error' : ' nice-form-control form-control'} />    
                        <ErrorMessage className='error' name="ownerId" component="span" />
            </label>


        
            <label htmlFor="createdDate" className="nice-form-control">
              <b>Created Date: {touched.createdDate && !errors.createdDate && (<span className="okCheck"><FaCheckCircle /> looks good!</span>)}</b>
              
              
              
          
          {/*createdDate DATE FIELD */}
              <Field name="createdDate" type="date"
                className={errors.createdDate  ? 'form-control field-error' : ' nice-form-control form-control'} />
                        <ErrorMessage className='error' name="createdDate" component="span" />
            </label>


        
            <label htmlFor="keyHash" className="nice-form-control">
              <b>Key Hash: {touched.keyHash && !errors.keyHash && (<span className="okCheck"><FaCheckCircle /> looks good!</span>)}</b>
              
              
              
          
          {/* keyHash  TEXT FIELD */}
              <Field name="keyHash" type="text"
                className={errors.keyHash  ? 'form-control field-error' : ' nice-form-control form-control'} />    
                        <ErrorMessage className='error' name="keyHash" component="span" />
            </label>


        
            <label htmlFor="lastAccessedById" className="nice-form-control">
              <b>Last Accessed By Id: {touched.lastAccessedById && !errors.lastAccessedById && (<span className="okCheck"><FaCheckCircle /> looks good!</span>)}</b>
              
              
              
          
          {/* lastAccessedById  TEXT FIELD */}
              <Field name="lastAccessedById" type="text"
                className={errors.lastAccessedById  ? 'form-control field-error' : ' nice-form-control form-control'} />    
                        <ErrorMessage className='error' name="lastAccessedById" component="span" />
            </label>


        
            <label htmlFor="lastAccessedDate" className="nice-form-control">
              <b>Last Accessed Date: {touched.lastAccessedDate && !errors.lastAccessedDate && (<span className="okCheck"><FaCheckCircle /> looks good!</span>)}</b>
              
              
              
          
          {/*lastAccessedDate DATE FIELD */}
              <Field name="lastAccessedDate" type="date"
                className={errors.lastAccessedDate  ? 'form-control field-error' : ' nice-form-control form-control'} />
                        <ErrorMessage className='error' name="lastAccessedDate" component="span" />
            </label>


        
            <label htmlFor="lastModifiedById" className="nice-form-control">
              <b>Last Modified By Id: {touched.lastModifiedById && !errors.lastModifiedById && (<span className="okCheck"><FaCheckCircle /> looks good!</span>)}</b>
              
              
              
          
          {/* lastModifiedById  TEXT FIELD */}
              <Field name="lastModifiedById" type="text"
                className={errors.lastModifiedById  ? 'form-control field-error' : ' nice-form-control form-control'} />    
                        <ErrorMessage className='error' name="lastModifiedById" component="span" />
            </label>


        
            <label htmlFor="lastModifiedDate" className="nice-form-control">
              <b>Last Modified Date: {touched.lastModifiedDate && !errors.lastModifiedDate && (<span className="okCheck"><FaCheckCircle /> looks good!</span>)}</b>
              
              
              
          
          {/*lastModifiedDate DATE FIELD */}
              <Field name="lastModifiedDate" type="date"
                className={errors.lastModifiedDate  ? 'form-control field-error' : ' nice-form-control form-control'} />
                        <ErrorMessage className='error' name="lastModifiedDate" component="span" />
            </label>

 
<br /><br />

                    <CoolButton
                      variant={(touched && isValid) ? (isSubmitting ? 'disabled' : 'success') : 'warning'}
                      type="submit"
                      onClick={() => { }}
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
                      <FaCheckCircle size={30} /> Create New Product
                    </CoolButton>


                        </Accordion.Body>
                      </Accordion.Item>
                    </Accordion>

          </form>
        )}
    </Formik>
    </div >
  );
};

/*

lowercase statuslookup
uppercase STATUSLOOKUP
snakecase status_lookup
pascalcase StatusLookup
camelcase statusLookup
kebabcase status-lookup


*/

const StatusLookup = () => { 
  return(
  <>
    
    <option value='available' label='Available' />
    
    
    <option value='discontinued' label='Discontinued' />
    
    
    <option value='out_of_stock' label='Out Of Stock' />
    
  </>
  )
};






export default ProductForm;